#
DisponibilidadDesempeño

En este tutorial se mostrará como se crea un grupo de autoescalamiento usando EC2 y los grupos de autoescalamiento de AWS

## Creando la instancia EC2

Primero que todo es necesario una maquina ya configurada para poder autoescalarla y que sea capaz de manejar multiples peticiones.

![](/images/ec2.png)

Cuando ya se tenga la instancia en EC2 que se manejará, es necesario manejar una aplicación que necesita gran capacidad de procesamiento
y dejar esta aplicación como servicio para que comience una vez se inicie la maquina, en este caso la aplicación sera implementada con un servicio REST
 con Spring y sera necesario el siguiente archivo de configuración para convertir el .jar en un servicio ejecutable.
 ![](/images/restService.png)
 
Cuando se halla creado y configurado la máquina es necesario crear un imagen de esta para que sea instanciada en el grupo.
De esta manera:
![](/images/ami1.png)
![](/images/ami2.png)
![](/images/ami3.png)

## Creando el launch template

Antes de crear el grupo de autoescalamiento es necesario crear la configuracion de este mismo con un "Launch Template" por tanto, nos iremos
a la sección de Launc Template en EC2.

![](/images/Launch1.png)
![](/images/Launch2.png)
Es importante que cuando se seleccione el ID del AMI este sea el ID de la imagen de la maquina que se acabo de crear.
![](/images/Launch3.png)

## Creando el grupo de auto escalamiento

Una vez se halla creado el grupo de auto escalamiento procedemos a la seccion de "AutoScaling->Auto scaling Group", y ahí mismo se selecciona "Create Ato Scaling Group"
![](/images/autoS1.png)
Se tiene que llenar los datos de acuerdo con los anteriores paso, como por ejemplo el "Launch Template" tiene que ser el mismo que se creo anteriormente
![](/images/autoS2.png)
Se procede a revisar que los datos ingresados sean los correctos y se creará le grupo
![](/images/autoS3.png)
Cuando ya se halla creado el grupo no sera posible ver sus detalles como por ejemplo el Launch Template que se escogio, la capacidad deseada, en numero de instancias maximo
y minimo que se quieren y sus politicas de autoescalamiento
