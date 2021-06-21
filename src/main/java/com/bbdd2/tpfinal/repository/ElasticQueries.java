package com.bbdd2.tpfinal.repository;

public class ElasticQueries {

    /*
Boolean matching

NativeSearchQuery searchQuery = new NativeSearchQueryBuilder()
  .withQuery(matchQuery("title","Search engines").operator(Operator.AND))
  .build();
SearchHits<Article> articles = elasticsearchTemplate()
  .search(searchQuery, Article.class, IndexCoordinates.of("blog"));

NativeSearchQuery searchQuery = new NativeSearchQueryBuilder()
  .withQuery(matchQuery("title", "Engines Solutions"))
  .build();
SearchHits<Article> articles = elasticsearchTemplate()
  .search(searchQuery, Article.class, IndexCoordinates.of("blog"));

    FUZINESS - GRADOS DE SEPARACION

    NativeSearchQuery searchQuery = new NativeSearchQueryBuilder()
  .withQuery(matchQuery("title", "spring date elasticsearch")
  .operator(Operator.AND)
  .fuzziness(Fuzziness.ONE)
  .prefixLength(3))
  .build();


    Multimatch query

    NativeSearchQuery searchQuery = new NativeSearchQueryBuilder()
  .withQuery(multiMatchQuery("tutorial")
    .field("title")
    .field("tags")
    .type(MultiMatchQueryBuilder.Type.BEST_FIELDS))
  .build();



  AGGREGATIONS


  TermsAggregationBuilder aggregation = AggregationBuilders.terms("top_tags")
  .field("tags")
  .order(Terms.Order.count(false));
SearchSourceBuilder builder = new SearchSourceBuilder().aggregation(aggregation);

SearchRequest searchRequest =
  new SearchRequest().indices("blog").types("article").source(builder);
SearchResponse response = client.search(searchRequest, RequestOptions.DEFAULT);

Map<String, Aggregation> results = response.getAggregations().asMap();
StringTerms topTags = (StringTerms) results.get("top_tags");

List<String> keys = topTags.getBuckets()
  .stream()
  .map(b -> b.getKeyAsString())
  .collect(toList());
assertEquals(asList("elasticsearch", "spring data", "search engines", "tutorial"), keys);



     */




}
