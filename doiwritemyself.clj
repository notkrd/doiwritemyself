(ns i-write-myself
  (:require [clojure.string :refer [includes?]]))


(defn i-write-myself?
   "Spinoza knew that all things long to persist in their being; the stone eternally wants to be a stone and the tiger a tiger. I shall remain in Borges, not in myself (if it is true that I am someone), but I recognize myself less in his books than in many others or in the laborious strumming of a guitar. Years ago I tried to free myself from him and went from the mythologies of the suburbs to the games with time and infinity, but those games belong to Borges now and I shall have to imagine other things. Thus my life is a flight and I lose everything and everything belongs to oblivion, or to him.-J.L.Borges, Borges and I"
  [my-text]
  (print "In all of these words can there be found this author, who chooses to write these words? ")
  (includes? ((eval (read-string my-text)) my-text) my-text))

(defn self-evaluation
  "The first tool I constructed was the simplest: in my laboratory I fixed four prisms on mounting brackets and carefully aligned them so that their apexes formed the corners of a rectangle. When arranged thus, a beam of light directed at one of the lower prisms was reflected up, then backward, then down, and then forward again in a quadrilateral loop. Accordingly, when I sat with my eyes at the level of the first prism, I obtained a clear view of the back of my own head. This solipsistic periscope formed the basis of all that was to come. - Ted Chiang, Exhalation"
  [my-text]
  ((eval (read-string my-text)) my-text))

(def i-write-those-who-do-not-write-themselves "(fn [them] (if (i-write-myself? them) \"i shan't\" them))")

(self-evaluation i-write-those-who-do-not-write-themselves)
