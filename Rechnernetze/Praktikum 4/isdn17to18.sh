#!/bin/bash

./deleteRouteSettings.sh

sudo /sbin/route add -net 192.168.18.0/24 gw 192.168.17.1 dev eth1