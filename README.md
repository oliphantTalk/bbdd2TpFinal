# TP FINAL DE BBDD2

Ver info de como levantar un elastic con docker en un solo nodo: https://markheath.net/post/exploring-elasticsearch-with-docker

Si ya se tiene el docker-compose.yml (el que subo al repo) simplemente correr `docker-compose -f docker-compose.yml up` y luego levantar la aplicacion Java 

# Indices

El nombre de los indices tiene que coincidir con los declarados en el @Document de cada objeto de modelo. 

# Crear un indice en elastic

curl -X PUT "localhost:9200/{nombre_indice}?pretty" (crear un endpoint en el controller para esto)

# Agregar un documento al indice creado

curl -X PUT "localhost:9200/{nombre_indice}/_doc/1?pretty" \
-H 'Content-Type: application/json' -d'{
    "name": "un_nombre"
}'

# Leer un indice recien creado

curl -X GET http://localhost:9200/{nombre_indice}/_search?pretty

# Elastic Search Queries

https://www.baeldung.com/spring-data-elasticsearch-queries
