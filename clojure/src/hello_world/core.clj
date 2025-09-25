(ns hello-world.core
  "A basic hello-world in Clojure")

(defn greet-boilermaker
  "Interpolates `boilermaker.variables.recipient` into a string, then
  prints and returns it."
  []
  (let [phrase "Hello, {{recipient}}!"]
    (println "hello-world.core/greet-boilermaker says:" phrase)
    phrase))

(defn greet
  "Takes a string `s` and creates the phrase 'Hello, {{s}}!'.
  Prints the phrase and returns it."
  [s]
  (let [phrase (format "Hello, %s!" s)]
    (println "hello-world.core/greet says:" phrase)
    phrase))
