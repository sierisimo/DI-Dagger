define(['exports', 'kotlin', 'kotlinx-html-js'], function (_, Kotlin, $module$kotlinx_html_js) {
  'use strict';
  var listOf = Kotlin.kotlin.collections.listOf_i5x0yv$;
  var println = Kotlin.kotlin.io.println_s8jyv4$;
  var get_create = $module$kotlinx_html_js.kotlinx.html.dom.get_create_4wc2mh$;
  var Unit = Kotlin.kotlin.Unit;
  var div = $module$kotlinx_html_js.kotlinx.html.js.div_wkomt5$;
  function main$lambda($receiver) {
    $receiver.unaryPlus_pdl1vz$('Ormando RM');
    return Unit;
  }
  var ArrayList_init = Kotlin.kotlin.collections.ArrayList_init_ww73n8$;
  var collectionSizeOrDefault = Kotlin.kotlin.collections.collectionSizeOrDefault_ba2ldo$;
  function main(args) {
    var $receiver = listOf([1, 4, 9, -9]);
    var destination = ArrayList_init();
    var tmp$;
    tmp$ = $receiver.iterator();
    while (tmp$.hasNext()) {
      var element = tmp$.next();
      if (element > 0)
        destination.add_11rb$(element);
    }
    var destination_0 = ArrayList_init(collectionSizeOrDefault(destination, 10));
    var tmp$_0;
    tmp$_0 = destination.iterator();
    while (tmp$_0.hasNext()) {
      var item = tmp$_0.next();
      destination_0.add_11rb$(new Sier(item, item.toString()));
    }
    var listOfNumbers = destination_0;
    println(listOfNumbers);
    div(get_create(document), 'sier2 oRMando', main$lambda);
  }
  function Sier(id, name) {
    this.id = id;
    this.name = name;
  }
  Sier.$metadata$ = {
    kind: Kotlin.Kind.CLASS,
    simpleName: 'Sier',
    interfaces: []
  };
  Sier.prototype.component1 = function () {
    return this.id;
  };
  Sier.prototype.component2 = function () {
    return this.name;
  };
  Sier.prototype.copy_19mbxw$ = function (id, name) {
    return new Sier(id === void 0 ? this.id : id, name === void 0 ? this.name : name);
  };
  Sier.prototype.toString = function () {
    return 'Sier(id=' + Kotlin.toString(this.id) + (', name=' + Kotlin.toString(this.name)) + ')';
  };
  Sier.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.id) | 0;
    result = result * 31 + Kotlin.hashCode(this.name) | 0;
    return result;
  };
  Sier.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && (Kotlin.equals(this.id, other.id) && Kotlin.equals(this.name, other.name)))));
  };
  _.main_kand9s$ = main;
  _.Sier = Sier;
  main([]);
  Kotlin.defineModule('octuber-kug', _);
  return _;
});

//# sourceMappingURL=octuber-kug.js.map
