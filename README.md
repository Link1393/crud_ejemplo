# Crud Ejemplo
Proyecto para crear un ejemplo de una aplicación web simple

## Uso de metodos del Controlador

### getUsuarios()
Con un get recuest usa la URL localhost:8080/usuario

### saveUsuario(UsuarioModel)
Con un save request usa a la URL localhost:8080/usuario
Debemos proveer los datos a guardar en JSON format:
{
    "nombre" : "nuevo nombre",
    "apellido" : "nuevo apellido",
    "cedula" : "nueva cedula",
    "telefono" : "nuevo telefono",
    "correo" : "nuevo correo"
}

### getUsuarioById(Long)
Con un get recuest usa la URL localhost:8080/usuario/{id}
{id} es el id del usuario que se desea buscar, por ejemplo: localhost:8080/usuario/1 traerá el usuario que tiene como id el 1.

### getUsuarioByCedula(String)
Con un get recuest usa la URL localhost:8080/usuario/queryCedula?cedula={numero de cedula a buscar}
Un ejemplo de este get request sería: localhost:8080/usuario/queryCedula?cedula=1115082347

### deleteUsuario(Long)
Con un delete request usa la URL localhost:8080/usuario/{id}
{id} es el id del usuario que se desea eliminar, por ejemplo: localhost:8080/usuario/1 eliminará el usuario que tiene como id el 1.