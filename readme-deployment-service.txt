 touch payment-service-deployment.yaml
 vi payment-service-deployment.yaml
 kubectl apply -f payment-service-deployment.yaml
 kubectl get pods
 kubectl get pods -o wide
 kubectl logs my-payment-6bcc498f5d-wvt56
 kubectl get deployments
 kubectl expose deployment my-payment --type=NodePort --name=my-payment
 kubectl get service
 curl --location --request POST 'http://172.16.123.62:8081/payment?user=cgs&reference=paycash&amount=1'


  322  kubectl apply -f paymentpod.yaml
  323  kubectl get pods
  324  kubectl get pods -o wide
  325  curl --location --request POST 'http://172.31.235.201:8081/payment?user=cgs&reference=paycash&amount=1'
  326  kubectl apply -f kube-payment-service.yaml
  327  kubectl get svc
  328  curl --location --request POST 'http://172.27.227.242:8081/payment?user=cgs&reference=paycash&amount=1'


Basically 

1. Deployment works
2. Define Pod, Then Define Service to point to that Pod
3. Run Pod, Run Service
4. For pod use IP from kubectl get pods -o wide
5. For Service use IP from kubectl get svc

