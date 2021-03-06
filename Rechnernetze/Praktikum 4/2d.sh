#!/bin/bash

./deleteSettings.sh

#Setze das Standartverhalten auf ACCEPT
sudo /usr/sbin/iptables -P INPUT ACCEPT
sudo /usr/sbin/iptables -P OUTPUT ACCEPT

#Blockiere eingehende icmp-Verbindungen mit echo-request
sudo /usr/sbin/iptables -A INPUT -s 172.16.1.0/24 -p icmp --icmp-type 8 -j DROP
sudo /usr/sbin/iptables -A OUTPUT -d 172.16.1.0/24 -p icmp --icmp-type 0 -j DROP