#!/bin/bash

./deleteSettings.sh

#Von 192.168.18.0/24 �ber den Router nach 192.168.17.0/24
sudo /sbin/route add -net 192.168.17.0/24 gw 192.168.18.2 dev eth1