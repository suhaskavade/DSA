class BiryaniOverException(BaseException):

    def __init__(self,msg):
        print("Biryani Constructor")

    def __new__(cls,*args,**kwargs):
        print("Biryani New")
        return super().__new__(cls)
    def __call__(self, *args, **kwds):
        print("In call")
        return super().__call__(*args, **kwds)

class order():

    def __init__(self):
        print("Biryani tayar ahe")

    def __new__(cls,*args,**kwargs):
        print("Sagli Tayari Zali")
        return super().__new__(cls)

    count =1
    def order(self):
        if self.count ==0:
            raise BiryaniOverException("Ny bhetnar Ky karaychay te kr")
        else:
            print("Tuza Sathich Thevly")
            self.count -=1

obj = order()
obj.order()
obj.order()