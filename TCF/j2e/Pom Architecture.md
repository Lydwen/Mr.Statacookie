# POM PAPA #

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

**entities** :
<ul>
<li>items</li>
<li>orders</li>
</ul>

**exceptions** :
<br/>*None*

**utils** :
<ul>
<li><i>orders</i></li>
<li><i>exceptions</i></li>
</ul>

**web-services** :
<ul>
<li><i>catalogue</i></li>
<li><i>items</i></li>
<li><i>exceptions</i></li>
</ul>

<br/>
> LEVEL 3

-- components
**cart-cashier** :
<ul>
<li><i>utils</i></li>
<li><i>orders</i></li>
<li><i>kitchen</i></li>
</ul>

-- components
**catalogue** :
<ul>
<li><i>items</i></li>
</ul>

-- components
**kitchen** :
<ul>
<li><i>exceptions</i></li>
<li><i>utils</i></li>
<li><i>orders</i></li>
</ul>

-- entities
**items** :
<br/>*None*

-- entities
**orders** :
<ul>
<li><i>items</i></li>
</ul>

