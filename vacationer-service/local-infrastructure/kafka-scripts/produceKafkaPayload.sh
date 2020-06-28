#!/bin/bash
cat sampleDocument | kafka-console-producer.sh --broker-list localhost:9092 --topic $TOPIC_NAME --property "parse.key=true" \
  --property "key.separator=|"