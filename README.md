# TP_Premier_Micro_Service_Avec_Spring_Boot_Compte_Service
Dans ce TP on va met en évidence la puissance de l'inversion de controle pour créer des micro-services à l'aide de Spring IOC  
Premièrement on va créer un nouveau projet de type Spring Initializr sous IntelliJ  
Le nom de ce micro service est : compte-service dans lequel on va gérer des comptes  
On suit on va ajouter les dependences:  
1- Spring Data JPA : Pour tous ce qui est mapping objet relationnel  
2- H2 Database : Une base de donnée mémoire, elle est trés pratique pour les tests  
3- Spring Web : Dans notre micro-service il y a une couche web qui nécessite un controlleur  
4- Lombok : Pour générer automatiquement les getters, setters et les constructeurs.
5- Rest Repositories : c'est de Spring data rest qui permet d'exposer facilement des web services Restful.
On trouve l'ensemble de ces dependences dans le fichier pom.xml  
On peut tester l'insertion des données dans la base à l'aide de CommandLineRunner  
Nous obtenons le résultat suivant  
![image](https://user-images.githubusercontent.com/102111459/174479071-5959f1b1-4fea-4fff-9405-396bd49b396c.png)  
Ici on affiche le type et le solde  
Pour voir ce qui ce passe dans la base de donnée nous pouvons accéder au site : http://localhost:8082/h2-console  
![image](https://user-images.githubusercontent.com/102111459/174479210-5a006ad4-ca40-45da-8eab-f10f6ac1755a.png)  
N.B : Le numero de port et le nom de la base de données sont mentionnés dans le fichier application.properties  
On appuyons sur Connect nous obtenons quelque chose comme ça  
![image](https://user-images.githubusercontent.com/102111459/174479278-2c1138f7-73a9-42c0-800f-75bd1599dba4.png)  
Sous l'anglet COMPTE nous pouvons avoir notre table:  
![image](https://user-images.githubusercontent.com/102111459/174479349-0d0d0b02-e8da-4304-8f95-48da382d11a6.png)  
Dans le package web on définit la méthode listComptes qui permet d'avoir la liste des comptes pour la testée on accéde à la page web suivante : http://localhost:8082/comptes  
Nous avons le résultat suivant sous format Json:  
![image](https://user-images.githubusercontent.com/102111459/174479468-5562e939-7228-4715-8fd7-ac4a04bf1700.png)  
Pour consulter un compte on ajoute le id dans l'adresse, après la définition bien sûr de la méthode getCompte dans la classe CompteRestController  
![image](https://user-images.githubusercontent.com/102111459/174479613-edce1184-31ba-4bce-b090-1511850079ee.png)  
Après on ajoute les autres méthodes : Update et Delete  
Pour tester ces méthodes nous pouvons utiliser l'outil Postman:  
![image](https://user-images.githubusercontent.com/102111459/174479723-dc6194cf-8d19-419c-98a0-88f98a856b8e.png)  
Pour GET  
![image](https://user-images.githubusercontent.com/102111459/174479772-ef53ccd8-96d7-4441-ab3e-1855eb003792.png)  
Pour POST: il faut envoyer les headers  
![image](https://user-images.githubusercontent.com/102111459/174479854-ba32fdcf-cbe3-4b1a-ae17-dab6626b0372.png)  
Dans le Body on peut mettre les informations sur le compte qu'on veut ajouter, puis on clique sur Send  
![image](https://user-images.githubusercontent.com/102111459/174480002-57590eb2-a3e4-43c6-aca2-0180cf3438bb.png)  
Par la suit nous pouvons tester les autres méthodes de la même façon  
Il y a un autre outil pour tester s'appele swagger-ui pour l'accéder on tape l'adresse suivante:  http://localhost:8082/swagger-ui/index.html dans le navigateur  
![image](https://user-images.githubusercontent.com/102111459/174480346-9e8cd5b4-0962-4a41-9316-d391e5ab818c.png)  
Dans Spring Data Rest on a la possibilité d'utiliser les projections pour ne afficher que les informations dont nous intéresse  
Par exemple la projection p1 permet d'afficher seulement le code et le solde  
![image](https://user-images.githubusercontent.com/102111459/174480498-27cc7b07-4158-4247-bd93-b41d948651fc.png)  
Tandis que la projection p2 permet d'afficher le type et le solde  
![image](https://user-images.githubusercontent.com/102111459/174480606-33c81bdd-560b-4d40-bebe-8c13ee2de9a4.png)  




