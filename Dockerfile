FROM clojure

WORKDIR /app

COPY project.clj /app

RUN lein deps

VOLUME /app
