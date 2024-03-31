(ns basic-route.core
  (:require [ring.adapter.jetty :refer [run-jetty]]
            [ring.middleware.params :refer [wrap-params]]
            [compojure.core :refer [defroutes GET POST]]
            [compojure.route :refer [not-found]])
  (:gen-class))

(defroutes routes
  (GET "/" [] "<h1>Hello, world!</h1>\n")
  (POST "/" [name] (str "<h1>Hello, " name "!</h1>\n"))
  (not-found "<h1>Page not found</h1>\n"))

(def handler
  (-> routes
      wrap-params))

(defn -main
  [& [port]]
  (let [port (or port (get (System/getenv) "PORT" 3000))
        port (cond-> port (string? port) Integer/parseInt)]
    (run-jetty handler {:port port
                        :join? false})))
