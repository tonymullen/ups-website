red_edge_sequence([State1|Rest]) :-
  start_state(State1),
  color_path([State1|Rest], red).

color_path([State1, State2], Color) :-
  trans(State1, State2, Color),
  end_state(State2).

color_path([State1, State2|Rest], Color) :-
  trans(State1, State2, Color),
  color_path([State2|Rest], Color).

alternating_edge_sequence([State1|Rest]) :-
  start_state(State1),
  alternating_path([State1|Rest], red).

alternating_edge_sequence([State1|Rest]) :-
  start_state(State1),
  alternating_path([State1|Rest], green).

alternating_path([State1, State2|Tail], Color) :-
  trans(State1, State2, Color),
  switch_color(Color, Color2),
  alternating_path([State2|Tail], Color2).

alternating_path([State1, State2], Color) :-
  color_path([State1, State2], Color).

switch_color(red, green).
switch_color(green, red).

matching_edge_state_sequence([State1|Tail]) :-
  start_state(State1),
  state(State1, Color),
  matching_edge_state_path([State1|Tail], Color).

matching_edge_state_path([State1, State2|Tail], Color) :-
  state(State2, Color),
  trans(State1, State2, Color),
  matching_edge_state_path([State2|Tail], Color).

matching_edge_state_path([State1, State2], Color) :-
  state(State2, Color),
  trans(State1, State2, Color),
  end_state(State2).

state(a, green).
state(b, red).
state(c, red).
state(d, red).
state(e, green).
state(f, green).
state(g, green).
state(h, green).
state(i, red).
state(j, green).
state(k, red).

start_state(a).
start_state(b).

end_state(j).
end_state(k).

trans(a, c, green).
trans(a, f, green).
trans(a, d, green).
trans(b, d, red).
trans(b, d, green).
trans(d, f, red).
trans(d, f, green).
trans(d, i, red).
trans(d, e, red).
trans(e, i, green).
trans(f, g, green).
trans(f, h, red).
trans(g, h, green).
trans(g, j, red).
trans(h, j, green).
trans(h, k, red).
trans(h, i, red).
trans(i, k, red).
