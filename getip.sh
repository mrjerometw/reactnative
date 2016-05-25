#!/bin/bash
OUTPUT=$SRCROOT/../../jk0701_xxx_ks.txt
#/sbin/ifconfig en0  | sed -n '/inet addr:/ s/inet addr:/IPADDR=/pg' | awk -F" " '{print $1}' >$OUTPUT
ifconfig en0 |sed '2p' |sed 's/^.*addr:/ /g' |sed 's/B.*$ / /g' >$OUTPUT
