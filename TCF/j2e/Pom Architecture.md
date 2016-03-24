# POM PAPA #

-- dad name<br/>
**module name**:
<ul>
<li>child</li>
<li><i>dependency</i></li>
</ul>

<br/>
> LEVEL 1

**POM DOYEN** :
<ul>
<li>components</li>
<li>entities</li>
<li>exceptions</li>
<li>utils</li>
<li>web-services</li>
</ul>

<br/>
> LEVEL 2

**components** :
<ul>
<li>cart-cashier</li>
<li>catalogue</li>
<li>kitchen</li>
</ul>

<br/>
**entities** :
<ul>
<li>items</li>
<li>orders</li>
</ul>

<br/>
**exceptions** :
<br/>*None*

<br/>
**utils** :
<ul>
<li><i>orders</i></li>
<li><i>exceptions</i></li>
</ul>

<br/>
**web-services** :
<ul>
<li><i>catalogue</i></li>
<li><i>items</i></li>
<li><i>exceptions</i></li>
</ul>

<br/>
> LEVEL 3

-- components <br/>
**cart-cashier** :
<ul>
<li><i>utils</i></li>
<li><i>orders</i></li>
<li><i>kitchen</i></li>
</ul>

<br/>
-- components <br/>
**catalogue** :
<ul>
<li><i>items</i></li>
</ul>

<br/>
-- components <br/>
**kitchen** :
<ul>
<li><i>exceptions</i></li>
<li><i>utils</i></li>
<li><i>orders</i></li>
</ul>

<br/>
-- entities <br/>
**items** :
<br/>*None*

<br/>
-- entities <br/>
**orders** :
<ul>
<li><i>items</i></li>
</ul>

