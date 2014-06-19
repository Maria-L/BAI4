#!/bin/bash

./deleteSettings.sh

sudo /usr/sbin/iptables -P INPUT ACCEPT
sudo /usr/sbin/iptables -P OUTPUT ACCEPT

sudo /usr/sbin/iptables -A INPUT -s 5.56.149.238 -p tcp --sport 80 -j ACCEPT
sudo /usr/sbin/iptables -A OUTPUT -d 5.56.149.238 -p tcp --dport 80 -j ACCEPT
sudo /usr/sbin/iptables -A INPUT -p tcp --sport 80 -j DROP
sudo /usr/sbin/iptables -A OUTPUT -p tcp --dport 80 -j DROP
