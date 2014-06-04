#!/bin/bash

./deleteSettings.sh

#Setze das Standartverhalten auf ACCEPT
iptables -P INPUT ACCEPT
iptables -P OUTPUT ACCEPT

#Blockiere eingehende icmp-Verbindungen
iptables -A INPUT -s 172.16.1.0/24 -p icmp -j DROP