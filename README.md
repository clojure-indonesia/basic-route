### RUN
```bash
$ clojure -M:run
[main] INFO org.eclipse.jetty.server.Server - jetty-11.0.20; built: 2024-01-29T21:04:22.394Z; git: 922f8dc188f7011e60d0361de585fd4ac4d63064; jvm 21.0.2+13-LTS
[main] INFO org.eclipse.jetty.server.handler.ContextHandler - Started o.e.j.s.ServletContextHandler@1e749235{/,null,AVAILABLE}
[main] INFO org.eclipse.jetty.server.AbstractConnector - Started ServerConnector@1896299b{HTTP/1.1, (http/1.1)}{0.0.0.0:3000}
[main] INFO org.eclipse.jetty.server.Server - Started Server@2979c6ef{STARTING}[11.0.20,sto=0] @8608ms
```
### PLAY
```
$ curl http://localhost:3000
<h1>Hello, world!</h1>
$ curl -d "name=John" http://localhost:3000
<h1>Hello, John!</h1>
$ curl -d "name=Jane" http://localhost:3000
<h1>Hello, Jane!</h1>
$ curl -d "name=Fred" http://localhost:3000
<h1>Hello, Fred!</h1>
$ curl http://localhost:3000/a
<h1>Page not found</h1>
```
### REFERENCES
- [https://clojure.org/](https://clojure.org/)
- [https://github.com/weavejester/compojure/](https://github.com/weavejester/compojure/)
- [https://github.com/ring-clojure/ring/](https://github.com/ring-clojure/ring/)
