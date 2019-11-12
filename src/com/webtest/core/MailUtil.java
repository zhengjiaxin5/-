����   4 �  com/webtest/core/MailUtil  java/lang/Object port I server Ljava/lang/String; from user password <clinit> ()V Code	      smtp.qq.com	      	马寅祥	   	   934518049@qq.com	   
   ljdijpduqjxobbfe	      LineNumberTable LocalVariableTable <init>
  % #  this Lcom/webtest/core/MailUtil; 	sendEmail 9(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V 
Exceptions , $java/io/UnsupportedEncodingException .  com/webtest/utils/ReadProperties
 - % 1 java/util/Properties
 0 % 4 mail.smtp.host
 0 6 7 8 put 8(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; : mail.smtp.port
 < > = java/lang/String ? @ valueOf (I)Ljava/lang/String; B mail.smtp.auth D true
 F H G javax/mail/Session I J getDefaultInstance F(Ljava/util/Properties;Ljavax/mail/Authenticator;)Ljavax/mail/Session; L smtp
 F N O P getTransport *(Ljava/lang/String;)Ljavax/mail/Transport; R fmail
 - T U V getPropertyValue &(Ljava/lang/String;)Ljava/lang/String;
 X Z Y javax/mail/Transport [ ) connect ] javax/mail/internet/MimeMessage
 \ _ # ` (Ljavax/mail/Session;)V b java/util/Date
 a %
 \ e f g setSentDate (Ljava/util/Date;)V i #javax/mail/internet/InternetAddress k UTF-8
 h m # )
 \ o p q setFrom (Ljavax/mail/Address;)V s ,
 < u v w split '(Ljava/lang/String;)[Ljava/lang/String;
 h y # z (Ljava/lang/String;)V	 | ~ }  javax/mail/Message$RecipientType  � TO "Ljavax/mail/Message$RecipientType;
 \ � � � addRecipients :(Ljavax/mail/Message$RecipientType;[Ljavax/mail/Address;)V
 \ � � � 
setSubject '(Ljava/lang/String;Ljava/lang/String;)V � text/html;charset=utf-8
 \ � � � 
setContent '(Ljava/lang/Object;Ljava/lang/String;)V
 \ � �  saveChanges
 \ � � � getAllRecipients ()[Ljavax/mail/Address;
 X � � � sendMessage ,(Ljavax/mail/Message;[Ljavax/mail/Address;)V
 � � � "javax/mail/NoSuchProviderException �  printStackTrace
 � � � javax/mail/MessagingException
 � � � java/io/IOException email subject body f "Lcom/webtest/utils/ReadProperties; props Ljava/util/Properties; 	transport Ljavax/mail/Transport; session Ljavax/mail/Session; msg !Ljavax/mail/internet/MimeMessage; fromAddress %Ljavax/mail/internet/InternetAddress; 	emailList [Ljava/lang/String; 	toAddress &[Ljavax/mail/internet/InternetAddress; i e $Ljavax/mail/NoSuchProviderException; Ljavax/mail/MessagingException; Ljava/io/IOException; StackMapTable � � main ([Ljava/lang/String;)V � 438117595@qq.com � 123 � 1
  � ( ) args 
SourceFile MailUtil.java InnerClasses � javax/mail/Message RecipientType !                 	     
                 J      � � � � � �    !          
      ! "       #      /     *� $�    !        "        & '   	 ( )  *     +   �     �� -Y� /N� 0Y� 2:3� � 5W9� � ;� 5WAC� 5W:� E:K� M:� Q� S� � W� \Y� ^:� aY� c� d� hYQ� S� j� l:� n*r� t:		�� h:
6� 
� hY	2� xS�	����� {
� �+j� �,�� �� �� �� �� N-� �� N-� �� N-� ��    � � �   � � �   � � �  !   z    %  &  '  ( * ) 4 * 7 + ? , H - X . c / o 1 � 2 � 3 � 4 � 6 � 7 � 6 � : � ; � < � = � > � ? � @ � A � B � C � E � G "   �    � �      � �     � �    � � �   � � �  7 � � �  ? � � �  c � � �  � d � �  � U � � 	 � M � � 
 �  �   �  � �  �  � �  �  � �  �   H � �  < < < - 0 X F \ h � �  � 5  < < <  �G �G � 	 � �  *     +    8     
��Ƹ ȱ    !   
    J 	 K "       
 � �    �    � �   
  | � � 	