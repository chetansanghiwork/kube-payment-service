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

