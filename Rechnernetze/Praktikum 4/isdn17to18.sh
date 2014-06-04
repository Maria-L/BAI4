#!/bin/bash

./deleteSettings.sh

sudo /usr/iptables -A INPUT  -s 192.168.18.0/24 -i eth1 -j ACCEPT
sudo /usr/iptables -A OUTPUT -d 192.168.18.0/24 -o eth1 -j ACCEPT
sudo /usr/iptables -A INPUT  -s 192.168.18.0/24 -i eth0 -j DROP
sudo /usr/iptables -A OUTPUT -d 192.168.18.0/24 -o eth0 -j DROP