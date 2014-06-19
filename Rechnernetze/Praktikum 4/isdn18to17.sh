#!/bin/bash

./resetRoute.sh

sudo /sbin/route add -net 192.168.17.0/24 gw 192.168.18.1 dev eth1