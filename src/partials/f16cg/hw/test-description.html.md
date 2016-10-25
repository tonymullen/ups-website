```
cacheable: false
```

## Shown

Stuff

## Hidden
<div ng-app="solutions">
<label for="pwd">Enter the password to view: </label>
<input id="pwd" type="password" ng-model="pw">
<br>
{{pw}}
<div ng-show="pw==='apple'">
Hello
</div>
</div>
