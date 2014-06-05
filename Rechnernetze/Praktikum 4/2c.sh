#!/bin/bash

./deleteSettings.sh

#Setze das Standartverhalten auf ACCEPT
sudo /usr/sbin/iptables -P INPUT ACCEPT
sudo /usr/sbin/iptables -P OUTPUT ACCEPT

#Blockiere eingehende icmp-Verbindungen
sudo /usr/sbin/iptables -A INPUT -s 172.16.1.0/24 -p tcp -m state --state NEW -j DROP