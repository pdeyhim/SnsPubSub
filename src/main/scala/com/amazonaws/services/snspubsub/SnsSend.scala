package com.amazonaws.services.snspubsub
import com.amazonaws.auth.BasicAWSCredentials
import com.amazonaws.auth.AWSCredentials

import com.amazonaws.services.sns.AmazonSNSClient
import com.amazonaws.services.sns.model.PublishRequest

class SnsSend {
  
  val snsClient:AmazonSNSClient = new AmazonSNSClient(new BasicAWSCredentials("", ""))

  def send(msg:String, topicArn:String):Unit = {
  
		val publishRequest:PublishRequest = new PublishRequest();  
		publishRequest.setMessage(msg.toString())
		publishRequest.setTopicArn(topicArn)
		snsClient.publish(publishRequest)
		//val test:String = msg
		//publishRequest=null
	
  }
  
}
