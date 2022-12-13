COMPOSE_PROJECT_NAME=jpa-demo

FILE=remove-localstack.sh

if [ -f "$FILE" ]; then
  docker compose -p $COMPOSE_PROJECT_NAME down
else
  CURRENT_DIR=$PWD

  FULL_PATH=$0
  FULL_PATH_LENGTH=${#FULL_PATH}

  LOCALSTACK=/remove-localstack.sh
  LOCALSTACK_LENGTH=${#LOCALSTACK}

  PATH_LENGTH=$((FULL_PATH_LENGTH - LOCALSTACK_LENGTH))

  SCRIPT_DIR=$(cut -c 1-${PATH_LENGTH} <<< ${FULL_PATH})

  cd $SCRIPT_DIR

  docker compose -p $COMPOSE_PROJECT_NAME down

  cd $CURRENT_DIR
fi