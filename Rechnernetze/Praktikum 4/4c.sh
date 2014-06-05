#!/bin/bash

./deleteSettings.sh

sudo /usr/sbin/iptables -P INPUT ACCEPT
sudo /usr/sbin/iptables -P OUTPUT ACCEPT

sudo /usr/sbin/iptables -A INPUT -s ! www.dmi.dk -p tcp --sport 80 -j DROP
sudo /usr/sbin/iptables -A OUTPUT -s ! www.dmi.dk -p tcp --dport 80 -j DROP