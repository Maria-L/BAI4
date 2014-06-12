#!/bin/bash

./deleteSettings.sh

#Setze das Standart-Verhalten auf ACCEPT
sudo /usr/sbin/iptables -P INPUT ACCEPT
sudo /usr/sbin/iptables -P OUTPUT ACCEPT

#Blocke alle ein- und ausgehenden Verbindungen auf 172.16.1.0/24
sudo /usr/sbin/iptables -A INPUT -s 172.16.1.0/24 -p all -j DROP
sudo /usr/sbin/iptables -A OUTPUT -d 172.16.1.0/24 -p all -j DROP