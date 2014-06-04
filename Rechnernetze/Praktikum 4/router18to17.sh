#!/bin/bash

./deleteSettings.sh

sudo /usr/sbin/iptables -P INPUT ACCEPT
sudo /usr/sbin/iptables -P OUTPUT ACCEPT

sudo /usr/sbin/iptables -A INPUT  -s 192.168.17.0/24 -i eth0 -j ACCEPT
sudo /usr/sbin/iptables -A OUTPUT -d 192.168.17.0/24 -o eth0 -j ACCEPT
sudo /usr/sbin/iptables -A INPUT  -s 192.168.17.0/24 -i eth1 -j DROP
sudo /usr/sbin/iptables -A OUTPUT -d 192.168.17.0/24 -o eth1 -j DROP