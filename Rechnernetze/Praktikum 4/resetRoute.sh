#!/bin/bash

sudo /sbin/route del -net 192.168.18.0/24 gw 192.168.17.2 dev eth1
sudo /sbin/route del -net 192.168.17.0/24 gw 192.168.18.2 dev eth1
sudo /sbin/route del -net 192.168.18.0/24 gw 192.168.17.1 dev eth1
sudo /sbin/route del -net 192.168.17.0/24 gw 192.168.18.1 dev eth1