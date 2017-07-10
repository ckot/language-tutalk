# this is a comment
c cpt.1 trans
  "foo" min
  "bar"

# this is another comment
c cpt2
 "blah blah blah"

# yet another comment
# two lines of comments
g start
  do goal.1

g goal.1 sem low diff 0 kc "foo bar"
  say "What is the answer to the most important question in the world?"
  if "42" true kc "1 2" say "more stuff" do goal.3
  else false say "nice try" do goal.2

g goal.1 sem high diff 1 kc "bar  baz"
    say some.cpt
    if gravity true kc "1 2 3 blah" say "Correct!" do goal.2
    else kc "3 4" say "That's not the answer I was looking for" do goal.3 do goal.4

g goal.2
  say "what is the weight of an unladen swallow?"
  if "Would that be african or european?" true kc "3 4" say "more stuff" do something.else
  if cpt.1 false kc kc.1 say cpt2 do something.completely.different
  unant kc "1 2 3 4" say cpt1 do "yet.something.else yet.something.else2"
