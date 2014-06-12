#!/bin/bash

./deleteSettings.sh

#Von 192.168.18.0/24 über den Router nach 192.168.17.0/24
route add 192.168.17.0 netmask 255.255.255.0 gw 192.168.18.2