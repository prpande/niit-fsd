export type Order = {
    id?: number;
    customerInfo?: {
        name?: string;
        email?: string;
        phone?: number;
        address?: {
            line1?: string;
            line2?: string;
            landmark?: string;
            city?: string;
            state?: string;
            pincode?: string;
        }
    }
    item?: {
        id?: number;
        name?: string;
        quantity?: number;
        category?: string;
    }
    totalAmount?: number;
    instructions?: string;
    orderDate?: string;
    deliveryDate?: string;
}