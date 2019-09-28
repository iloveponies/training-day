(ns training-day)

( def        ;defines a function
  answer      ;name
  42     ;implementation
)

( def hai "O HAI!")


( defn        ;defines a function
  square      ;name
  "This function returns square of a number"
  [x]         ;argument of function
  (* x x )    ;implementation
)

( defn        ;defines a function
  average     ;name
  "This function returns average of two numbers"
  [a b]       ;argument of function
  (/ ( + a b ) 2 )  ;implementation
)
