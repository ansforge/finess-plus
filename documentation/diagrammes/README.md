# Diagrammes d'architecture FINESS+

Ce dossier contient les diagrammes d'architecture logiciel et technique du projet FINESS+.

#### Outils utilisés :

        - Papyrus: C'est un outil basé sur Eclipse qui permet de modéliser des systèmes en utilisant différents langages graphiques comme UML, SysML, etc.
        - SysML: C'est un langage graphique standardisé pour modéliser des systèmes complexes qui incluent du matériel, du logiciel, de l'information, des processus, du personnel et des installations.

## Installation
Pour installer Papyrus depuis  suis ces étapes:
1. Télécharge l'installateur en fonction de votre système d'exploitation depuis https://www.eclipse.org/papyrus/download.html 
et suivez les instructions correspondantes. 

        Dans le cas de Windows, il suffit de décompresser le fichier .zip et copier le dossier "papyrus" à l'emplacement de votre choix, par exemple "C:\Program Files".

2. Exécutez ensuite le fichier papyrus.exe et définissez l'espace de travail de votre choix. 
        Astuce: Vous pouvez créer un raccourci sur votre bureau pour ouvrir facilement Papyrus.

![Papyrus Launcher](img/launcher.png?raw=true "définissez l'espace de travail")

### Librairie SysML

Pour installer la librairie SysML pour Papyrus 

1. Ouvrez Eclipse et sélectionnez Help -> Eclipse Marketplace dans la barre de menu supérieure 
2. Recherchez "Papyrus" sur le Marketplace et sélectionnez SysML 1.6 et cliquez sur "Install" sur la page des détails. 
3. Accepte les termes de la licence et clique sur Terminer pour installer Papyrus.
4. Suivez les instructions à l'écran pour terminer l'installation de SysML.

![Librairie SysML](img/marketplace.png?raw=true "définissez l'espace de travail")

## Auto-sauvegarde de projet avec Papyrus
Pour configurer l'auto-sauvegarde de projet dans Papyrus, suivez les étapes suivantes :

1. Sélectionnez *Window -> Preferences* dans la barre de menu supérieure. 
2. Dans le champ de recherche de la fenêtre des *Preferences*, tapez "**save**".
3. Sélectionnez *Général -> Editors -> Autosave*
4. Cochez la case *Enable autosave for dirty editors* 
5. Définissez un intervalle de temps pour la sauvegarde automatique (conseillé 1 seconde)
6. Cliquez sur "Appy and Close" pour enregistrer les modifications.
   
![Auto-sauvegarde](img/autosave.png?raw=true "Auto-sauvegarde de projet")

## Ouvrir un projet dans Papyrus

Pour ouvrir le projet dans Papyrus, suivez les étapes suivantes :



1. Ouvrez Papyrus(Eclipse) et sélectionnez *File -> Import* dans la barre de menu supérieure ou dans le *Project Explorer* cliquez sur *Import project...*

![](img/import.png?raw=true "")

1. Sélectionnez *General -> Project from Folder or Archive* et cliquez sur "Next"

![](img/import_wizard.png?raw=true "")
3. Dans l'Explorateur sélectionnez le dossier correspondant au projet que vous souhaitez ouvrir et cliquez sur *Sélectionner un dossier*

![](img/import_browse_folder.png?raw=true "")

4. Cochez la case correspondant au projet et cliquez sur *Finish* 

![](img/import_from_file_system.png?raw=true "")

5. Dans le *Project Explorer*  d'*Eclipse*, on voit la racine du projet. Cliquez avec le bouton droit de la souris et sélectionnez *Open*. 
   
   ![](img/import_open_model.png?raw=true "")

La fenêtre de chargement s'affiche et, une fois le processus terminé, vous trouverez le projet dans l'Explorateur de modèles (Model Explorer).

![](img/import_project_loading.png?raw=true "")

        N'ouvrez pas le projet avec l'extension .profile , il correspond au méta-modèle UML.

6. Fermer l'"Explorateur de projet"
   
        Si vous le souhaitez, vous pouvez fermer l'"Explorateur de projet", car il n'est plus nécessaire et vous pouvez gagner de la place dans la fenêtre. 
        
![](img/import_close_project_explorer.png?raw=true "")


