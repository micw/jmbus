#!/bin/bash
#
# This script downloads a new version and removes everything that's not meant to be in git

if [ -z "$1" ]; then
  echo "USAGE: $0 VERSION"
  exit 1
fi

VERSION=$1

set -e
shopt -s extglob

cd $( dirname $0)

echo "Cleaning work dir"

rm -vrf !("get_version.sh"|"README.md")

echo "Downloading and extracting jmbus-${VERSION}.tgz"

curl -s https://www.openmuc.org/m-bus/files/releases/jmbus-${VERSION}.tgz | \
  tar xfvz - --strip-components=1
