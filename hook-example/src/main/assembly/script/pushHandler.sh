#!/bin/bash
cd `dirname $0`
SCRIPT_DIR=`pwd`
echo $SCRIPT_DIR
cd /data/

DEPOLY_DIR=`pwd`
echo $DEPOLY_DIR


git pull origin master

