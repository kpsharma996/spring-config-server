#!/bin/bash

docker image build -t client-one client-one

docker image build -t client-two client-two

docker image build -t config-server spring-config-server
