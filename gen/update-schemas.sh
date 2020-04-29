#!/usr/bin/env bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )/schemas"
curl -o "$DIR"/Users.json "${UPSOURCE_URL}"/~api_doc/json/Users.json
curl -o "$DIR"/Projects.json "${UPSOURCE_URL}"/~api_doc/json/Projects.json
curl -o "$DIR"/Ids.json "${UPSOURCE_URL}"/~api_doc/json/Ids.json
curl -o "$DIR"/Service.json "${UPSOURCE_URL}"/~api_doc/json/Service.json
curl -o "$DIR"/IssueTrackers.json "${UPSOURCE_URL}"/~api_doc/json/IssueTrackers.json
curl -o "$DIR"/Misc.json "${UPSOURCE_URL}"/~api_doc/json/Misc.json
curl -o "$DIR"/Analytics.json "${UPSOURCE_URL}"/~api_doc/json/Analytics.json
curl -o "$DIR"/FindUsages.json "${UPSOURCE_URL}"/~api_doc/json/FindUsages.json
curl -o "$DIR"/FileOrDirectoryContent.json "${UPSOURCE_URL}"/~api_doc/json/FileOrDirectoryContent.json
