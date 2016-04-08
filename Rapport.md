DALL'AGNOL Tom
BUISSON Kévin
ROLLIN Antoine


# Mr.Statacookie #

## Points positifs ##

<ul>
<li>Modulaire: seules les parties modifiées et celles qui en dépendent sont recompilées (grâce à Maven)</li>
<li>Fiable: les erreurs ne sont pas push donc les dépendances sont toujours fonctionnelles et ne nous empêche pas de travailler</li>
<li>Gestion de la mémoire: la VM a une capacité, nous ne gardons que les 10 derniers build (dont le dernier build en succès)</li>
<li>Automatisation du test d'intégration: le dotNet est lancé avec chaque le début des tests d'intégration et arrêté ensuite</li>
<li>Bon découpage en modules: permet de réduire un maximum la récupération de parties du code dont nous n'avons pas besoin</li>
<ul>

## Points négatifs ##

<ul>
<li>(TODO) Si nous modifions un module A et mettons un test d'un module B en erreur (A et B indépendant), le nouveau module A n'est pas push sur Artifactory à cause de B</li>
<li>Attente active: Jenkins scrute le projet toute les minutes pour recompiler les modules modifiés. Si nous avons beaucoup de jobs qui font ça, la bandde-passante est saturée.</li>
<li>Plus long: le téléchargement des dépendances rallonge le temps de build comparé au code monolithique.</li>
<li>Mémoire polluée: contrairement à Jenkins, Artifactory garde tous les push, la mémoire est n'est donc pas nettoyée.</li>
<li>Release?: Artifactory ne contient pas de release (cf Snapshot).</li>
<ul>