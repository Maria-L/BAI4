#!/bin/bash

./deleteSettings.sh

#Setze das Standart-Verhalten auf ACCEPT
sudo /usr/sbin/iptables -P INPUT ACCEPT
sudo /usr/sbin/iptables -P OUTPUT ACCEPT

#Nehme nur Verbindungen auf 172.16.1.0/24 an, die �ber TCP:51000 laufen und NEW oder ESTABLISHED sind
sudo /usr/sbin/iptables -A INPUT -s 172.16.1.0/24 -p tcp --dport 51000 -m state --state NEW,ESTABLISHED -j ACCEPT
sudo /usr/sbin/iptables -A INPUT -s 172.16.1.0/24 -p all -j DROP

#Lass Verbindungen auf 172.16.1.0/24 �ber TCP:51000 die ESTABLISHED sind heraus
sudo /usr/sbin/iptables -A OUTPUT -d 172.16.1.0/24 -p tcp --sport 51000 -m state --state ESTABLISHED -j ACCEPT
sudo /usr/sbin/iptables -A OUTPUT -d 172.16.1.0/24 -p all -j DROP