;; This is an example locales.clj that we expect to be generated by projects
;; which generate uberjars and need to build a list of the locales.clj maps
[
 {
  :locales  #{"en" "de"}
  :packages ["puppetlabs.i18n"]
  :bundle   "puppetlabs.i18n.Messages"
 }
 {
  :locales  #{"en" "fr"}
  :packages ["puppetlabs.foo"]
  :bundle   "puppetlabs.foo.Messages"
 }
]
