sudo /sbin/ip route flush table all

sudo /sbin/route add default gw 141.22.26.1 dev eth0
sudo /sbin/route add -net 172.16.1.0/24 gw 0.0.0.0 dev eth2
sudo /sbin/route add -net 127.0.0.0/8 gw 0.0.0.0 dev lo