from xmlrpc.server import SimpleXMLRPCServer

server = SimpleXMLRPCServer(("localhost", 8000))
print("Listening on port 8000...")

def is_even(n):
    print("Requisição recebida com o seguinte argumento: " + str(n))
    return n % 2 == 0

server.register_function(is_even, "is_even")

try:
    print("Control-C to exit server")
    server.serve_forever()
except KeyboardInterrupt:
    print ("Exiting server...")