(ns immutant-demo.core)

(defn ring-handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello from Immutant!" })

(defn another-ring-handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Pssst! Over here!"})
