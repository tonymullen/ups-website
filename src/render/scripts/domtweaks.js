  $( document ).ready(function() {
      $('div.tables-begin').nextUntil('div.tables-end', 'table').addClass('table table-bordered table-hover table-condensed');
  
      $('.latex').each(function() {
                  var it = this;
                  var v = $(it).text();
                  it.innerHTML = "$\\displaystyle "+v+"$";
                  new latex2mml().patch_element(it);
              });
  });
