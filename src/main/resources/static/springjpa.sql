PGDMP     3    "                y            springdb    13.1    13.1     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16508    springdb    DATABASE     l   CREATE DATABASE springdb WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'English_United States.1252';
    DROP DATABASE springdb;
                postgres    false            �            1259    16600    users    TABLE     �   CREATE TABLE public.users (
    usersid bigint NOT NULL,
    dob date,
    fnm character varying(255),
    lnm character varying(255)
);
    DROP TABLE public.users;
       public         heap    postgres    false            �          0    16600    users 
   TABLE DATA           7   COPY public.users (usersid, dob, fnm, lnm) FROM stdin;
    public          postgres    false    200   9       "           2606    16607    users users_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (usersid);
 :   ALTER TABLE ONLY public.users DROP CONSTRAINT users_pkey;
       public            postgres    false    200            �   "   x�3�4202�50"μ��|Μ�T�=... U1�     