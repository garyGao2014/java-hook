#!/bin/bash
cd /data/designmode/
PULL_DIR=`pwd`
echo $PULL_DIR

git pull origin master

echo 'OK!'