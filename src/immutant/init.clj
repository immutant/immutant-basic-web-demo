(ns immutant.init
  (:use immutant-demo.core)
  (:require [immutant.web :as web]))

;; This file will be loaded when the application is deployed to Immutant, and
;; can be used to start services your app needs. Examples:

;; Web endpoints need a context-path and ring handler function. The context
;; path given here is a sub-path to the global context-path for the app
;; if any.

(web/start "/" ring-handler)
(web/start "/biscuits" another-ring-handler)

;; Web endpoints can be stopped from anywhere in your code with:
;; (web/stop "/")
;; This is optional - any endpoints you leave up will be stopped when your
;; app is undeployed.


