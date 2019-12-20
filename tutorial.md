## 1. 엘라스틱 기본 개념 / 용어  
엘라스틱은 nosql db라고 생각하면 이해가 쉽다고 한다. (json형태)

 - index 인덱스, type 타입, document 문서로 엘라스틱 기본 데이터 계층 주고라고 한다.  
   index는 database  
   type은 table  
   document는 row (한 데이터의 라인)  
   으로 생각 할 수 있다.  
   
 - field 필드는 column에 대응되는 구조 즉 컬럼
   
 - mapping 맵핑은 인덱스, 타입, 문서 규칙의 정의한 것 db로 따지면 schema를 본다는 것과 비슷하다.
    
 - 클러스터/노드(cluster/node): 여러 대의 서버를 묶어서 구동하기 위해 사용되는 개념이다. 각 서버가 노드, 서버의 묶음이 클러스터.  
  
 - 샤드/복사본(shard/replica): 엘라스틱서치는 색인 데이터를 하나의 물리적 데이터 공간에만 저장하는 게 아니라, 여러 개의 저장공간에 
 나누거나 복사할 수 있다. shard는 성능향상을 위해 데이터를 여러 물리적 공간에 나눠 저장하는 것이고, 
 replica는 한 노드가 실패했을 때도 검색서비스 제공이 가능하도록 데이터를 여러 물리적 공간(그리고 노드)에 복제해 두는 것이다.
  
 - QueryDSL: JSON으로 표현되는 엘라스틱서치의 검색 문법이다.
 
   
## 2.  엘라스틱 설치
 - 나는 엘라스틱을 docker에 올리는 방법을 선택하였다.  
   
 - docker pull docker.elastic.co/elasticsearch/elasticsearch:7.4.2
   
 - docker run -p 9200:9200 -p 9300:9300 -e "discovery.type=single-node" docker.elastic.co/elasticsearch/elasticsearch:7.4.2
   
 - curl -XGET localhost:9200
<pre><code>
<pre><code>

</code></pre>
 - 아주 간략히 구성하는 것이라 이래 저래 상세하게 한다면 docker-compose를 이용해서 설정 파일은 볼륨을 걸고 docker swarm을 설정하여 replicas를 구성하는 것이 맞다.
   
   
## 3. Spring 및 Elasticsearch 구현
