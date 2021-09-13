(ns clojure-noob.core
  (:gen-class))

(defn error-message
  [severity]
  (str "OH GOD! IT'S A DISASTER! WE'RE "
       (if (= severity :mild)
         "MILDLY INCONVENIENCED!"
         "DOOOOOOOMED!")))

(defn too-enthusiastic
   "Return a cheer that might be a bit too enthusiastic"
   [name]
   (str "OH. MY. GOD! " name " YOU ARE MOST DEFINITELY LIKE THE BEST "
  "MAN SLASH WOMAN EVER I LOVE YOU AND WE SHOULD RUN AWAY SOMEWHERE"))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "I am a little teapot!")
  (+ 1 2 3 4)
  (error-message :mild)
  (too-enthusiastic "Zelda"))